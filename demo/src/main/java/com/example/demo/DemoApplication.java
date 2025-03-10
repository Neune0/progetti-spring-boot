package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	// @Component annotation is used to mark the class as Spring Bean
	// @Service annotation is used to mark the class as Service class
	// @Repository annotation is used to mark the class as Data Access Object
	// @Controller annotation is used to mark the class as Controller class
	// @RestController annotation is used to mark the class as Restful Controller class
	// @Configuration annotation is used to mark the class as Configuration class
	// @Bean annotation is used to mark the method as Bean method
	// @Scope annotation is used to define the scope of the bean
	// @Lazy annotation is used to define the bean as lazy initialization
	// @Value annotation is used to inject the value from the properties file
	// @Qualifier annotation is used to define the bean name
	// @Primary annotation is used to define the primary bean
	// @Autowired annotation is used to inject the bean
	// @Resource annotation is used to inject the bean
	// @PostConstruct annotation is used to execute the method after the bean initialization
	// @PreDestroy annotation is used to execute the method before the bean destroy
	// @RequestMapping annotation is used to define the request mapping
	// @GetMapping annotation is used to define the get request mapping
	// @PostMapping annotation is used to define the post request mapping
	// @PutMapping annotation is used to define the put request mapping
	// @DeleteMapping annotation is used to define the delete request mapping
	// @PatchMapping annotation is used to define the patch request mapping
	// @PathVariable annotation is used to define the path variable
	// @RequestParam annotation is used to define the request parameter
	// @RequestBody annotation is used to define the request body
	// @ResponseBody annotation is used to define the response body
	// @ResponseStatus annotation is used to define the response status
	// @ExceptionHandler annotation is used to define the exception handler
	// @ControllerAdvice annotation is used to define the global exception handler
	// @EnableWebMvc annotation is used to enable the web mvc
	// @EnableAutoConfiguration annotation is used to enable the auto configuration
	// @EnableConfigurationProperties annotation is used to enable the configuration properties
	// @EnableJpaRepositories annotation is used to enable the jpa repositories
	// @EnableTransactionManagement annotation is used to enable the transaction management
	// @EnableCaching annotation is used to enable the caching
	// @EnableScheduling annotation is used to enable the scheduling
	// @EnableAsync annotation is used to enable the asynchronous
	// @EnableAspectJAutoProxy annotation is used to enable the aspectj auto proxy
	// @EnableJpaAuditing annotation is used to enable the jpa auditing
	// @EnableJpaRepositories annotation is used to enable the jpa repositories
	// @Entity annotation is used to define the entity class
	// @Table annotation is used to define the table name
	// @Id annotation is used to define the primary key
	// @GeneratedValue annotation is used to define the primary key generation strategy
	// @Column annotation is used to define the column name
	// @Temporal annotation is used to define the date and time
	// @Transient annotation is used to define the non-persistent field
	// @OneToOne annotation is used to define the one-to-one relationship
	// @OneToMany annotation is used to define the one-to-many relationship
	// @ManyToOne annotation is used to define the many-to-one relationship
	// @ManyToMany annotation is used to define the many-to-many relationship
	// @JoinColumn annotation is used to define the join column
	// @JoinTable annotation is used to define the join table
	// @JsonFormat annotation is used to define the date format
	// @JsonIgnore annotation is used to ignore the field
	// @JsonIgnoreProperties annotation is used to ignore the properties
	// @JsonInclude annotation is used to include the properties
	// @JsonProperty annotation is used to define the property
	// @JsonRootName annotation is used to define the root name
	// @JsonUnwrapped annotation is used to unwrap the properties
	// @JsonView annotation is used to define the view
	// @JsonManagedReference annotation is used to define the managed reference
	// @JsonBackReference annotation is used to define the back reference
	// @JsonIdentityInfo annotation is used to define the identity info
	// @JsonFilter annotation is used to define the filter
	// @JsonTypeInfo annotation is used to define the type info
	// @JsonSubTypes annotation is used to define the sub types
	// @JsonCreator annotation is used to define the creator
	// @JsonValue annotation is used to define the value
	// @JsonAnyGetter annotation is used to define the any getter
	// @JsonAnySetter annotation is used to define the any setter
	// @JsonSetter annotation is used to define the setter
	// @JsonGetter annotation is used to define the getter
	// @JsonSetter annotation is used to define the setter
	// @JsonGetter annotation is used to define the getter
	// @JsonAlias annotation is used to define the alias
	// @JsonAutoDetect annotation is used to define the auto detect
	// @JsonFormat annotation is used to define the format
	// @JsonInclude annotation is used to define the include
	// @JsonManagedReference annotation is used to define the managed reference
	// @JsonRawValue annotation is used to define the raw value
	// @JsonRootName annotation is used to define the root name
	// @JsonUnwrapped annotation is used to define the unwrapped
	// @JsonView annotation is used to define the view
	// @JsonTypeInfo annotation is used to define the type info
	// @JsonSubTypes annotation is used to define the sub types
	// @JsonTypeName annotation is used to define the type name
	// @JsonTypeId annotation is used to define the type id
	// @JsonIdentityInfo annotation is used to define the identity info
	// @JsonFilter annotation is used to define the filter
	// @JsonClassDescription annotation is used to define the class description
	// quando usare i bean?
	// quando si vuole creare un oggetto che rappresenta un'entità
	// quando si vuole creare un oggetto che rappresenta un'operazione
	// quando si vuole creare un oggetto che rappresenta un'interfaccia
	// quando si vuole creare un oggetto che rappresenta un'implementazione
	// quando si vuole creare un oggetto che rappresenta un'eccezione
	// quando si vuole creare un oggetto che rappresenta un'errore
	// quando si vuole creare un oggetto che rappresenta un'evento
	// quando si vuole creare un oggetto che rappresenta un'azione
	// quando si vuole creare un oggetto che rappresenta un'attività
	// disaccoppiamento
	// migliorare test
	// facilitare mock
	// non bisogna abusare dei bean perche
	// aumenta la complessità
	// aumenta la manutenzione
	// aumenta il consumo di memoria
	// aumenta il consumo di cpu
	// aumenta il consumo di disco
	// aumenta il consumo di rete
	// aumenta il consumo di energia
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
