.class public final Lqc3/k1;
.super Lqc3/a;
.source "SourceFile"


# instance fields
.field public final a:Lsc3/d;


# direct methods
.method public constructor <init>(Lsc3/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc3/k1;->a:Lsc3/d;

    return-void
.end method


# virtual methods
.method public final a()Lsc3/d;
    .locals 1

    iget-object v0, p0, Lqc3/k1;->a:Lsc3/d;

    return-object v0
.end method

.method public final b()Luc3/b;
    .locals 1

    sget-object v0, Lqc3/l1;->a:Lqc3/w;

    return-object v0
.end method

.method public final d(Luc3/b;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lqc3/w;

    const-string v0, "intermediate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lqc3/w;->a:Ljava/lang/Integer;

    const-string v1, "year"

    invoke-static {v0, v1}, Lqc3/l1;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object p1, p1, Lqc3/w;->b:Ljava/lang/Integer;

    const-string v1, "monthNumber"

    invoke-static {p1, v1}, Lqc3/l1;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-instance v1, Lkotlinx/datetime/YearMonth;

    invoke-direct {v1, v0, p1}, Lkotlinx/datetime/YearMonth;-><init>(II)V

    return-object v1
.end method
