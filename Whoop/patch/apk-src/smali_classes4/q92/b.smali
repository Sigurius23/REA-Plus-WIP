.class public final Lq92/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf93/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lf93/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J$\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u00022\n\u0010\n\u001a\u0006\u0012\u0002\u0008\u00030\tH\u0096\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lq92/b;",
        "Lf93/c;",
        "",
        "Loh3/d;",
        "",
        "tag",
        "<init>",
        "(Ljava/lang/String;)V",
        "thisRef",
        "Lj93/z;",
        "property",
        "a",
        "(Ljava/lang/Object;Lj93/z;)Loh3/d;",
        "w",
        "Ljava/lang/String;",
        "core_release"
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
.field private final w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq92/b;->w:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lj93/z;)Loh3/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lj93/z;",
            ")",
            "Loh3/d;"
        }
    .end annotation

    const-string v0, "thisRef"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lq92/b;->w:Ljava/lang/String;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_1

    sget-object p1, Loh3/e;->a:Loh3/c;

    iget-object p2, p0, Lq92/b;->w:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Loh3/e;->c:[Loh3/d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v3}, Loh3/d;->f()Ljava/lang/ThreadLocal;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    sget-object p1, Loh3/e;->a:Loh3/c;

    return-object p1
.end method

.method public bridge synthetic getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lq92/b;->a(Ljava/lang/Object;Lj93/z;)Loh3/d;

    move-result-object p1

    return-object p1
.end method
