.class public final Lv93/b;
.super Lr93/m1;
.source "SourceFile"


# static fields
.field public static final c:Lv93/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lv93/b;

    const-string v1, "protected_and_package"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lr93/m1;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lv93/b;->c:Lv93/b;

    return-void
.end method


# virtual methods
.method public final a(Lr93/m1;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "visibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lr93/d1;->c:Lr93/d1;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    sget-object v0, Lr93/l1;->a:Ln83/f;

    sget-object v0, Lr93/g1;->c:Lr93/g1;

    if-eq p1, v0, :cond_3

    sget-object v0, Lr93/h1;->c:Lr93/h1;

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    const-string v0, "protected/*protected and package*/"

    return-object v0
.end method

.method public final c()Lr93/m1;
    .locals 1

    sget-object v0, Lr93/i1;->c:Lr93/i1;

    return-object v0
.end method
