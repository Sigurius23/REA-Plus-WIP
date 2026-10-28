.class public final La3/j1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lb2/v;

.field public b:I

.field public c:Lr1/c;

.field public d:Lr1/c;

.field public e:Z

.field public final synthetic f:La3/l1;


# direct methods
.method public constructor <init>(La3/l1;Lb2/v;ILr1/c;Lr1/c;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/j1;->f:La3/l1;

    iput-object p2, p0, La3/j1;->a:Lb2/v;

    iput p3, p0, La3/j1;->b:I

    iput-object p4, p0, La3/j1;->c:Lr1/c;

    iput-object p5, p0, La3/j1;->d:Lr1/c;

    iput-boolean p6, p0, La3/j1;->e:Z

    return-void
.end method


# virtual methods
.method public final a(II)Z
    .locals 2

    iget-object v0, p0, La3/j1;->c:Lr1/c;

    iget v1, p0, La3/j1;->b:I

    add-int/2addr p1, v1

    iget-object v0, v0, Lr1/c;->w:[Ljava/lang/Object;

    aget-object p1, v0, p1

    check-cast p1, Lb2/u;

    iget-object v0, p0, La3/j1;->d:Lr1/c;

    add-int/2addr v1, p2

    iget-object p2, v0, Lr1/c;->w:[Ljava/lang/Object;

    aget-object p2, p2, v1

    check-cast p2, Lb2/u;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    if-ne p1, p2, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
