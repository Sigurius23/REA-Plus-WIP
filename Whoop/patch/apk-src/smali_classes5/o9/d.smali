.class public final synthetic Lo9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo9/n;


# instance fields
.field public final synthetic w:Lo9/q;

.field public final synthetic x:Lo9/j;

.field public final synthetic y:Z

.field public final synthetic z:[I


# direct methods
.method public synthetic constructor <init>(Lo9/q;Lo9/j;Z[I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo9/d;->w:Lo9/q;

    iput-object p2, p0, Lo9/d;->x:Lo9/j;

    iput-boolean p3, p0, Lo9/d;->y:Z

    iput-object p4, p0, Lo9/d;->z:[I

    return-void
.end method


# virtual methods
.method public final c(ILu8/p0;[I)Lzr/w0;
    .locals 10

    iget-object v0, p0, Lo9/d;->w:Lo9/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v8, Lo9/e;

    iget-object v5, p0, Lo9/d;->x:Lo9/j;

    invoke-direct {v8, v0, v5}, Lo9/e;-><init>(Lo9/q;Lo9/j;)V

    iget-object v0, p0, Lo9/d;->z:[I

    aget v9, v0, p1

    invoke-static {}, Lzr/g0;->l()Lzr/d0;

    move-result-object v0

    const/4 v1, 0x0

    move v4, v1

    :goto_0
    iget v1, p2, Lu8/p0;->a:I

    if-ge v4, v1, :cond_0

    new-instance v1, Lo9/f;

    aget v6, p3, v4

    iget-boolean v7, p0, Lo9/d;->y:Z

    move v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v9}, Lo9/f;-><init>(ILu8/p0;ILo9/j;IZLo9/e;I)V

    invoke-virtual {v0, v1}, Lzr/a0;->a(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lzr/d0;->f()Lzr/w0;

    move-result-object p1

    return-object p1
.end method
