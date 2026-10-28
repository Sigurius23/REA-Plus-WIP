.class public final Lsi/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Lsi/t;


# direct methods
.method public constructor <init>(Lsi/t;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lsi/a;->a:Ljava/util/ArrayList;

    iput-object p1, p0, Lsi/a;->b:Lsi/t;

    return-void
.end method
