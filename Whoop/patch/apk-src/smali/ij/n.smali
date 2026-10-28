.class public final Lij/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lij/n;->a:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Lij/m;)V
    .locals 3

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Lzt/q;

    .line 5
    invoke-direct {v0, p1}, Lzt/q;-><init>(Lij/m;)V

    .line 6
    const-string p1, "IntegrationsBridge"

    iput-object p1, v0, Lzt/q;->x:Ljava/lang/Object;

    .line 7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lij/n;->a:Ljava/util/ArrayList;

    .line 8
    new-instance p1, La3/m1;

    const/16 v1, 0x14

    invoke-direct {p1, p0, v1}, La3/m1;-><init>(Ljava/lang/Object;I)V

    .line 9
    new-instance v1, Lij/p;

    const-string v2, "track"

    invoke-direct {v1, v2, p1}, Lij/p;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1}, Lzt/q;->A(Lij/p;)V

    return-void
.end method
