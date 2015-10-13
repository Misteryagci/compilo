package utils;
import java.io.*;
import java.lang.*;
import java.util.*;


// Environnement
// Il sagit d'une pile d'arbres binaires partag�s

public class Env {
/*
	
	private Env prev;
	private Env next;
	private BinaryTree root=null;
	private int id;
	private static int ID = 0;

	public Env(Env prev, Env next, BinaryTree root) {
		this.prev=prev;
		this.next=next;
		this.root=root;
		this.id=Env.ID++;
	}

	public Env(Env prev, Env next) {
		this.prev=prev;
		this.next=next;
		this.root=null;
		this.id=Env.ID++;
	}

	public Env(Env prev) {
		this.prev=prev;
		this.next=null;
		this.root=null;
		this.id=Env.ID++;
	}

	public Env() {
		this.prev=null;
		this.next=null;
		this.root=null;
		this.id=Env.ID++;
	}

	public int getId() {
		return id;
	}

	public Env getPrev() {
		return prev;
	}

	public void putPrev(Env prev) {
		this.prev = prev;
	}

	public Env getNext() {
		return next;
	}

	public void putNext(Env next) {
		this.next = next;
	}

	public BinaryTree getRoot() {
		return root;
	}

	// produit un fichier dot (graphviz)
	public void toDot(String file) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("./"+file+".dot"));
			StringBuffer str = new StringBuffer();
			str.append("digraph Env {");
			for (Env e=this; e!=null; e=e.next){
				str.append(e.id+" [shape=\"box\", label=\"s"+e.id+"\"];"+"\n");
			}
			for (Env e=this; e!=null; e=e.next){
				if (e.root!=null){
					e.root.toDot(str);
					str.append(e.id+" -> "+e.root.getId()+";\n");
				}
			}
			str.append("}");
			out.write(str.toString());
			out.close();
		} catch (IOException e) {
			System.out.println("ERROR: build dot");
		}		
	}

	// Ajoute un symbole dans l'environnement
	public void add(String s, Type t) {
		//System.err.printf("********************************* %s \n", s, t);  
		if (root==null){
			if (prev!=null && prev.root!=null){
				root=new BinaryTree(prev.root.getLeft(), prev.root.getRight(), prev.root.getSymbol(), prev.root.getType()); 
				root=root.add(s, t, root);
			} else {
				root=new BinaryTree(s, t);
				root=root.add(s, t, root);
			}
		} else {		
			root=root.add(s, t, root);
		}
	}

	// retrouve un symbole dans l'environnement
	public Type find(String s){
		if (root!=null)
			return root.find(s);
		else
			return null;

	}
*/

	private Env prev;
    private HashMap<String, Type> symbols;


    public Env(Env p)
    {
        prev = p;
        symbols = new HashMap<String, Type>();
    }

    public Env() { this(null); }

    public Env getPrev() { return prev; }

    public void add(String s, Type t)
    {
        symbols.put(s, t);
    }

    public Type find(String s)
    {
        Type t = null;

        for (Env e = this ; e != null ; e = e.prev)
        {   
            t = e.symbols.get(s);
            if (t != null) return t;       
        }

        return null;
    }
}
