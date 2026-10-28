.class public final Lqc3/e0;
.super Lqc3/a;
.source "SourceFile"


# instance fields
.field public final a:Lsc3/d;


# direct methods
.method public constructor <init>(Lsc3/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc3/e0;->a:Lsc3/d;

    return-void
.end method


# virtual methods
.method public final a()Lsc3/d;
    .locals 1

    iget-object v0, p0, Lqc3/e0;->a:Lsc3/d;

    return-object v0
.end method

.method public final b()Luc3/b;
    .locals 1

    sget-object v0, Lqc3/f0;->b:Lqc3/u;

    return-object v0
.end method

.method public final d(Luc3/b;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lqc3/u;

    const-string v0, "intermediate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lqc3/u;->e()Lkotlinx/datetime/LocalTime;

    move-result-object p1

    return-object p1
.end method
