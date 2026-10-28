.class public final Llf3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/a2;


# instance fields
.field public final a:Lxf3/c;

.field public final b:Laa3/i1;


# direct methods
.method public constructor <init>(Lxf3/c;Laa3/i1;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llf3/a;->a:Lxf3/c;

    iput-object p2, p0, Llf3/a;->b:Laa3/i1;

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Class;)Landroidx/lifecycle/w1;
    .locals 3

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Llf3/a;->b:Laa3/i1;

    iget-object v0, p1, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v0, Lj93/d;

    iget-object v1, p1, Laa3/i1;->c:Ljava/lang/Object;

    check-cast v1, Lvf3/a;

    iget-object p1, p1, Laa3/i1;->e:Ljava/lang/Object;

    check-cast p1, Lc93/a;

    iget-object v2, p0, Llf3/a;->a:Lxf3/c;

    invoke-virtual {v2, p1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/w1;

    return-object p1
.end method
