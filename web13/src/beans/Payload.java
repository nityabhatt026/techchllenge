package beans;

public class Payload {

	    private Order order;

	    private String addonInstance;

	    private Company company;

	    private Account account;

	    private String addonBinding;

	    private Configuration configuration;

	    private String notice;

	    private String user;

	    public Order getOrder ()
	    {
	        return order;
	    }

	    public void setOrder (Order order)
	    {
	        this.order = order;
	    }

	    public String getAddonInstance ()
	    {
	        return addonInstance;
	    }

	    public void setAddonInstance (String addonInstance)
	    {
	        this.addonInstance = addonInstance;
	    }

	    public Company getCompany ()
	    {
	        return company;
	    }

	    public void setCompany (Company company)
	    {
	        this.company = company;
	    }

	    public Account getAccount ()
	    {
	        return account;
	    }

	    public void setAccount (Account account)
	    {
	        this.account = account;
	    }

	    public String getAddonBinding ()
	    {
	        return addonBinding;
	    }

	    public void setAddonBinding (String addonBinding)
	    {
	        this.addonBinding = addonBinding;
	    }

	    public Configuration getConfiguration ()
	    {
	        return configuration;
	    }

	    public void setConfiguration (Configuration configuration)
	    {
	        this.configuration = configuration;
	    }

	    public String getNotice ()
	    {
	        return notice;
	    }

	    public void setNotice (String notice)
	    {
	        this.notice = notice;
	    }

	    public String getUser ()
	    {
	        return user;
	    }

	    public void setUser (String user)
	    {
	        this.user = user;
	    }

	   /* public String toString()
	    {
	        return "ClassPojo [order = "+order+", addonInstance = "+addonInstance+", company = "+company+", account = "+account+", addonBinding = "+addonBinding+", configuration = "+configuration+", notice = "+notice+", user = "+user+"]";
	    }*/
	}

