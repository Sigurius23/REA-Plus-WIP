.class public final Ljo/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lrm/p1;

.field public final b:I

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lrm/q1;IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, Lrm/q1;->w:Lzr/g0;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lrm/p1;

    iput-object p1, p0, Ljo/q;->a:Lrm/p1;

    iput p3, p0, Ljo/q;->b:I

    iput-object p4, p0, Ljo/q;->c:Ljava/lang/String;

    return-void
.end method
