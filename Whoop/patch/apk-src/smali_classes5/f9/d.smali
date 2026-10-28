.class public final Lf9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lu8/p;

.field public final b:Lzr/g0;

.field public final c:Lf9/s;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lu8/p;Ljava/util/ArrayList;Lf9/s;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf9/d;->a:Lu8/p;

    invoke-static {p2}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object p1

    iput-object p1, p0, Lf9/d;->b:Lzr/g0;

    iput-object p3, p0, Lf9/d;->c:Lf9/s;

    iput-object p4, p0, Lf9/d;->d:Ljava/lang/String;

    iput-object p5, p0, Lf9/d;->e:Ljava/util/ArrayList;

    iput-object p6, p0, Lf9/d;->f:Ljava/util/ArrayList;

    return-void
.end method
