.class public final synthetic Lqi/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqi/v;


# instance fields
.field public final synthetic a:Lqi/w;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lqi/w;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqi/q;->a:Lqi/w;

    iput p2, p0, Lqi/q;->b:I

    iput p3, p0, Lqi/q;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lqi/q;->a:Lqi/w;

    iget-object v1, v0, Lqi/w;->w:Lqi/i;

    iget v2, p0, Lqi/q;->b:I

    iget v3, p0, Lqi/q;->c:I

    if-nez v1, :cond_0

    iget-object v1, v0, Lqi/w;->F:Ljava/util/ArrayList;

    new-instance v4, Lqi/q;

    invoke-direct {v4, v0, v2, v3}, Lqi/q;-><init>(Lqi/w;II)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget-object v0, v0, Lqi/w;->x:Ldj/e;

    int-to-float v1, v2

    int-to-float v2, v3

    const v3, 0x3f7d70a4    # 0.99f

    add-float/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Ldj/e;->i(FF)V

    return-void
.end method
