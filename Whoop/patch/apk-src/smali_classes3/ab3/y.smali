.class public final Lab3/y;
.super Lab3/b;
.source "SourceFile"


# instance fields
.field public final c:Llb3/y;


# direct methods
.method public constructor <init>(Ljava/util/List;Llb3/y;)V
    .locals 2

    new-instance v0, Ls;

    const/4 v1, 0x2

    invoke-direct {v0, p2, v1}, Ls;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0, p1, v0}, Lab3/b;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    iput-object p2, p0, Lab3/y;->c:Llb3/y;

    return-void
.end method
