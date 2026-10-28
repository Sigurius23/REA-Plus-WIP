.class public final Lqc3/b0;
.super Lqc3/a;
.source "SourceFile"


# instance fields
.field public final a:Lsc3/d;


# direct methods
.method public constructor <init>(Lsc3/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc3/b0;->a:Lsc3/d;

    return-void
.end method


# virtual methods
.method public final a()Lsc3/d;
    .locals 1

    iget-object v0, p0, Lqc3/b0;->a:Lsc3/d;

    return-object v0
.end method

.method public final b()Luc3/b;
    .locals 1

    sget-object v0, Lqc3/c0;->b:Lqc3/t;

    return-object v0
.end method

.method public final d(Luc3/b;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lqc3/t;

    const-string v0, "intermediate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlinx/datetime/LocalDateTime;

    iget-object v1, p1, Lqc3/t;->a:Lqc3/s;

    invoke-virtual {v1}, Lqc3/s;->b()Lkotlinx/datetime/LocalDate;

    move-result-object v1

    iget-object p1, p1, Lqc3/t;->b:Lqc3/u;

    invoke-virtual {p1}, Lqc3/u;->e()Lkotlinx/datetime/LocalTime;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lkotlinx/datetime/LocalDateTime;-><init>(Lkotlinx/datetime/LocalDate;Lkotlinx/datetime/LocalTime;)V

    return-object v0
.end method
