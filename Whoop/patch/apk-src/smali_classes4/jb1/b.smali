.class public final Ljb1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0008\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ1\u0010\u0013\u001a\u00020\u00062\n\u0010\u000f\u001a\u0006\u0012\u0002\u0008\u00030\u000e2\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0004j\u0002`\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\n8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\rR^\u0010\u001f\u001aF\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0004j\u0002`\u00110\u001aj\"\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0004j\u0002`\u0011`\u001b8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Ljb1/b;",
        "",
        "<init>",
        "()V",
        "Lkotlin/Function1;",
        "Llb1/z0;",
        "Ll83/a0;",
        "block",
        "b",
        "(Lkotlin/jvm/functions/Function1;)V",
        "Llb1/y0;",
        "mapper",
        "c",
        "(Llb1/y0;)V",
        "Lj93/d;",
        "itemClass",
        "Lm91/u;",
        "Lcom/whoop/design/reducer/ItemConfig;",
        "config",
        "a",
        "(Lj93/d;Lkotlin/jvm/functions/Function1;)V",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "setModelMapper$design_models_release",
        "modelMapper",
        "Ljava/util/HashMap;",
        "Lkotlin/collections/HashMap;",
        "Ljava/util/HashMap;",
        "d",
        "()Ljava/util/HashMap;",
        "itemConfigs",
        "design-models_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private a:Llb1/y0;

.field private final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lj93/d;",
            "Lkotlin/jvm/functions/Function1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Llb1/c1;->a()Llb1/y0;

    move-result-object v0

    iput-object v0, p0, Ljb1/b;->a:Llb1/y0;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ljb1/b;->b:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final a(Lj93/d;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj93/d;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "itemClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljb1/b;->b:Ljava/util/HashMap;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final b(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z0;

    invoke-direct {v0}, Llb1/z0;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Llb1/z0;->b()Llb1/y0;

    move-result-object p1

    iget-object v0, p0, Ljb1/b;->a:Llb1/y0;

    invoke-virtual {v0, p1}, Llb1/y0;->c(Llb1/y0;)Llb1/y0;

    move-result-object p1

    iput-object p1, p0, Ljb1/b;->a:Llb1/y0;

    return-void
.end method

.method public final c(Llb1/y0;)V
    .locals 1

    const-string v0, "mapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljb1/b;->a:Llb1/y0;

    invoke-virtual {v0, p1}, Llb1/y0;->c(Llb1/y0;)Llb1/y0;

    move-result-object p1

    iput-object p1, p0, Ljb1/b;->a:Llb1/y0;

    return-void
.end method

.method public final d()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Lj93/d;",
            "Lkotlin/jvm/functions/Function1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ljb1/b;->b:Ljava/util/HashMap;

    return-object v0
.end method

.method public final e()Llb1/y0;
    .locals 1

    iget-object v0, p0, Ljb1/b;->a:Llb1/y0;

    return-object v0
.end method
