
public final class ImmutableExample {

	private static final String name = "CHANDRAN";
	private final int money=10;
    
	private Object object;
	public void add(Object object) {
	this.object = object;
	}
	public Object get() {
	return object;
	}

	
	public static void main(String[] args) {

		ImmutableExample im = new ImmutableExample();
		
		System.out.println(im.money);
		im.add(1);
		System.out.println(im.get());
		
		String address = new String("kumar");
		System.out.println(address.hashCode());
		
		System.out.println(address);
		System.out.println(address.hashCode());
		String addr=address;
		System.out.println(addr);
		System.out.println(addr.hashCode());
		
		System.out.println(name);
		System.out.println(name.hashCode());
		
	}

	
}
