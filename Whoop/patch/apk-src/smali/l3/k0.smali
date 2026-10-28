.class public final Ll3/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/j;


# instance fields
.field public final synthetic w:Lc93/m;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lc93/m;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll3/k0;->w:Lc93/m;

    iput-object p2, p0, Ll3/k0;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final a(Ly1/b;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll3/k0;->w:Lc93/m;

    invoke-interface {v0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll3/k0;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
