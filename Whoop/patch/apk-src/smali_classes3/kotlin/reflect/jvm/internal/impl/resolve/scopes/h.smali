.class public final Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;
.super Lya3/p;
.source "SourceFile"


# instance fields
.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;->b:Ljava/util/ArrayList;

    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;->c:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;

    return-void
.end method


# virtual methods
.method public final b(Lr93/c;)V
    .locals 1

    const-string v0, "fakeOverride"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lya3/n;->r(Lr93/c;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(Lr93/c;Lr93/c;)V
    .locals 3

    const-string v0, "fromCurrent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Conflict in scope of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;->c:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;

    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;->getContainingClass()Lr93/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " vs "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
