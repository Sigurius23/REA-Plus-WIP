.class public final Lrh/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/List;

.field public d:Ljava/util/List;

.field public e:Ljava/util/List;

.field public final f:Ll83/p;

.field public final g:Ll83/p;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrh/d;->a:Ljava/util/List;

    iput-object p2, p0, Lrh/d;->b:Ljava/util/List;

    iput-object p3, p0, Lrh/d;->c:Ljava/util/List;

    iput-object p4, p0, Lrh/d;->d:Ljava/util/List;

    iput-object p5, p0, Lrh/d;->e:Ljava/util/List;

    new-instance p1, Lrh/b;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lrh/b;-><init>(Lrh/d;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lrh/d;->f:Ll83/p;

    new-instance p1, Lrh/b;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lrh/b;-><init>(Lrh/d;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lrh/d;->g:Ll83/p;

    return-void
.end method
