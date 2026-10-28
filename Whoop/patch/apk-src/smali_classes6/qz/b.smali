.class public final Lqz/b;
.super Lad3/j;
.source "SourceFile"


# static fields
.field public static final c:Lqz/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lqz/b;

    const-class v1, Lcom/stripe/android/financialconnections/model/PaymentAccount;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lad3/j;-><init>(Lj93/d;)V

    sput-object v0, Lqz/b;->c:Lqz/b;

    return-void
.end method


# virtual methods
.method public final a(Lkotlinx/serialization/json/JsonElement;)Lwc3/b;
    .locals 1

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lad3/m;->i(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    move-result-object p1

    const-string v0, "object"

    invoke-virtual {p1, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    invoke-virtual {p1}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v0, "linked_account"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "financial_connections.account"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    sget-object p1, Lcom/stripe/android/financialconnections/model/BankAccount;->Companion:Lcom/stripe/android/financialconnections/model/g;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/g;->serializer()Lwc3/c;

    move-result-object p1

    goto :goto_2

    :cond_2
    :goto_1
    sget-object p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->Companion:Lcom/stripe/android/financialconnections/model/l;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/l;->serializer()Lwc3/c;

    move-result-object p1

    :goto_2
    check-cast p1, Lwc3/b;

    return-object p1
.end method
