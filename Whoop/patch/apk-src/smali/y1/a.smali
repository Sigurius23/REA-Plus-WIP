.class public final synthetic Ly1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:[Ljava/lang/Object;

.field public final synthetic w:Ly1/b;

.field public final synthetic x:Ly1/j;

.field public final synthetic y:Ly1/f;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ly1/b;Ly1/j;Ly1/f;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/a;->w:Ly1/b;

    iput-object p2, p0, Ly1/a;->x:Ly1/j;

    iput-object p3, p0, Ly1/a;->y:Ly1/f;

    iput-object p4, p0, Ly1/a;->z:Ljava/lang/String;

    iput-object p5, p0, Ly1/a;->E:Ljava/lang/Object;

    iput-object p6, p0, Ly1/a;->F:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Ly1/a;->w:Ly1/b;

    iget-object v1, v0, Ly1/b;->x:Ly1/f;

    iget-object v2, p0, Ly1/a;->y:Ly1/f;

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    iput-object v2, v0, Ly1/b;->x:Ly1/f;

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, v0, Ly1/b;->y:Ljava/lang/String;

    iget-object v4, p0, Ly1/a;->z:Ljava/lang/String;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iput-object v4, v0, Ly1/b;->y:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    iget-object v1, p0, Ly1/a;->x:Ly1/j;

    iput-object v1, v0, Ly1/b;->w:Ly1/j;

    iget-object v1, p0, Ly1/a;->E:Ljava/lang/Object;

    iput-object v1, v0, Ly1/b;->z:Ljava/lang/Object;

    iget-object v1, p0, Ly1/a;->F:[Ljava/lang/Object;

    iput-object v1, v0, Ly1/b;->E:[Ljava/lang/Object;

    iget-object v1, v0, Ly1/b;->F:Ly1/e;

    if-eqz v1, :cond_2

    if-eqz v3, :cond_2

    check-cast v1, Ls/m2;

    invoke-virtual {v1}, Ls/m2;->u()V

    const/4 v1, 0x0

    iput-object v1, v0, Ly1/b;->F:Ly1/e;

    invoke-virtual {v0}, Ly1/b;->b()V

    :cond_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
