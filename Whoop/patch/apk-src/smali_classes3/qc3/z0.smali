.class public final Lqc3/z0;
.super Lqc3/a;
.source "SourceFile"


# instance fields
.field public final a:Lsc3/d;


# direct methods
.method public constructor <init>(Lsc3/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc3/z0;->a:Lsc3/d;

    return-void
.end method


# virtual methods
.method public final a()Lsc3/d;
    .locals 1

    iget-object v0, p0, Lqc3/z0;->a:Lsc3/d;

    return-object v0
.end method

.method public final b()Luc3/b;
    .locals 1

    sget-object v0, Lqc3/a1;->d:Lqc3/v;

    return-object v0
.end method

.method public final d(Luc3/b;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Lqc3/v;

    const-string v0, "intermediate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lqc3/v;->a:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    iget-object v1, p1, Lqc3/v;->b:Ljava/lang/Integer;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    mul-int/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    iget-object v3, p1, Lqc3/v;->c:Ljava/lang/Integer;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    mul-int/2addr v3, v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, v2

    :goto_2
    iget-object p1, p1, Lqc3/v;->d:Ljava/lang/Integer;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    mul-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_3
    invoke-static {v1, v3, v2}, Lpc3/s;->a(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lkotlinx/datetime/UtcOffset;

    move-result-object p1

    return-object p1
.end method
