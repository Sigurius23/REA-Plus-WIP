.class public final synthetic Lp12/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lc93/a;

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lc93/a;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp12/j;->w:Lc93/a;

    iput-object p2, p0, Lp12/j;->x:Lc93/a;

    iput-object p3, p0, Lp12/j;->y:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lp12/j;->x:Lc93/a;

    iget-object v1, p0, Lp12/j;->y:Lp1/c1;

    iget-object v2, p0, Lp12/j;->w:Lc93/a;

    invoke-static {v2, v0, v1}, Lp12/l$a;->b(Lc93/a;Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
