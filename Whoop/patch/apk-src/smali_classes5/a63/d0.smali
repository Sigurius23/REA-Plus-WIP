.class public final La63/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La63/i0;


# instance fields
.field public final a:Lkotlin/jvm/functions/Function3;

.field public final b:La63/i0;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function3;La63/i0;)V
    .locals 1

    const-string v0, "interceptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La63/d0;->a:Lkotlin/jvm/functions/Function3;

    iput-object p2, p0, La63/d0;->b:La63/i0;

    return-void
.end method


# virtual methods
.method public final a(Le63/d;Ls83/c;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, La63/d0;->a:Lkotlin/jvm/functions/Function3;

    iget-object v1, p0, La63/d0;->b:La63/i0;

    invoke-interface {v0, v1, p1, p2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
