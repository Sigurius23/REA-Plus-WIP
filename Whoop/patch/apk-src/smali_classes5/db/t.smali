.class public final Ldb/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lu8/u0;

.field public final b:I

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lu8/v0;IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, Lu8/v0;->a:Lzr/g0;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu8/u0;

    iput-object p1, p0, Ldb/t;->a:Lu8/u0;

    iput p3, p0, Ldb/t;->b:I

    iput-object p4, p0, Ldb/t;->c:Ljava/lang/String;

    return-void
.end method
