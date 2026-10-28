.class public final Lf20/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf20/a;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lf20/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lf20/a;->a:Lf20/a;

    return-void
.end method

.method public static a(Ly00/u1;)Lf20/b;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    iget-object v1, p0, Ly00/u1;->F:Ljava/util/Map;

    sget-object v2, Ly00/s1;->y:Ly00/s1;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    if-eqz v1, :cond_2

    if-eqz p0, :cond_1

    iget-object v1, p0, Ly00/u1;->F:Ljava/util/Map;

    sget-object v2, Ly00/s1;->x:Ly00/s1;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    if-nez v1, :cond_2

    sget-object p0, Lf20/b;->x:Lf20/b;

    return-object p0

    :cond_2
    :try_start_0
    const-string v1, "com.stripe.android.financialconnections.FinancialConnectionsSheet"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    goto :goto_2

    :catch_0
    move v1, v0

    :goto_2
    if-eqz v1, :cond_3

    sget-object p0, Lf20/b;->w:Lf20/b;

    goto :goto_3

    :cond_3
    if-eqz p0, :cond_4

    iget-object p0, p0, Ly00/u1;->F:Ljava/util/Map;

    sget-object v0, Ly00/s1;->x:Ly00/s1;

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    :cond_4
    if-nez v0, :cond_5

    sget-object p0, Lf20/b;->x:Lf20/b;

    goto :goto_3

    :cond_5
    const/4 p0, 0x0

    :goto_3
    return-object p0
.end method
