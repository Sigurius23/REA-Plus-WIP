.class public final Lyi/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyi/b;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lxi/b;

.field public final c:Ljava/util/ArrayList;

.field public final d:Lxi/a;

.field public final e:Lxi/a;

.field public final f:Lxi/b;

.field public final g:I

.field public final h:I

.field public final i:F

.field public final j:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lxi/b;Ljava/util/ArrayList;Lxi/a;Lxi/a;Lxi/b;IIFZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyi/p;->a:Ljava/lang/String;

    iput-object p2, p0, Lyi/p;->b:Lxi/b;

    iput-object p3, p0, Lyi/p;->c:Ljava/util/ArrayList;

    iput-object p4, p0, Lyi/p;->d:Lxi/a;

    iput-object p5, p0, Lyi/p;->e:Lxi/a;

    iput-object p6, p0, Lyi/p;->f:Lxi/b;

    iput p7, p0, Lyi/p;->g:I

    iput p8, p0, Lyi/p;->h:I

    iput p9, p0, Lyi/p;->i:F

    iput-boolean p10, p0, Lyi/p;->j:Z

    return-void
.end method


# virtual methods
.method public final a(Lqi/w;Lqi/i;Lzi/b;)Lsi/c;
    .locals 0

    new-instance p2, Lsi/s;

    invoke-direct {p2, p1, p3, p0}, Lsi/s;-><init>(Lqi/w;Lzi/b;Lyi/p;)V

    return-object p2
.end method
