.class public final Lhf/d;
.super Lh5/z;
.source "SourceFile"


# instance fields
.field public final z:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "src"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "src2Dest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lh5/z;-><init>(Ljava/util/Iterator;Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Lhf/d;->z:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final remove()V
    .locals 1

    iget-object v0, p0, Lhf/d;->z:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    return-void
.end method
