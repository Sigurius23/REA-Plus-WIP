.class public final Lkotlin/reflect/jvm/internal/impl/resolve/scopes/k;
.super Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;
.source "SourceFile"


# instance fields
.field public final b:Lkb3/i;


# direct methods
.method public constructor <init>(Lkb3/n;Lc93/a;)V
    .locals 2

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljb3/l;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1}, Ljb3/l;-><init>(Lc93/a;I)V

    check-cast p1, Lkb3/k;

    new-instance p2, Lkb3/i;

    invoke-direct {p2, p1, v0}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/k;->b:Lkb3/i;

    return-void
.end method


# virtual methods
.method public final b()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/k;->b:Lkb3/i;

    invoke-virtual {v0}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    return-object v0
.end method
