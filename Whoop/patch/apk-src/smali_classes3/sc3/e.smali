.class public final Lsc3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsc3/q;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lq00/h0;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lq00/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsc3/e;->a:Ljava/lang/Object;

    iput-object p2, p0, Lsc3/e;->b:Lq00/h0;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lsc3/e;->b:Lq00/h0;

    invoke-virtual {v0, p1}, Lq00/h0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lsc3/e;->a:Ljava/lang/Object;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
