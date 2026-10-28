.class public final Lh23/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lj23/b;

.field public final b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lj23/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh23/a;->a:Lj23/b;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lh23/a;->b:Ljava/util/ArrayList;

    return-void
.end method
