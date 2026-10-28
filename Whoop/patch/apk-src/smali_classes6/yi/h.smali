.class public final Lyi/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyi/b;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Lxi/b;

.field public final d:Lxi/f;

.field public final e:Lxi/b;

.field public final f:Lxi/b;

.field public final g:Lxi/b;

.field public final h:Lxi/b;

.field public final i:Lxi/b;

.field public final j:Z

.field public final k:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ILxi/b;Lxi/f;Lxi/b;Lxi/b;Lxi/b;Lxi/b;Lxi/b;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyi/h;->a:Ljava/lang/String;

    iput p2, p0, Lyi/h;->b:I

    iput-object p3, p0, Lyi/h;->c:Lxi/b;

    iput-object p4, p0, Lyi/h;->d:Lxi/f;

    iput-object p5, p0, Lyi/h;->e:Lxi/b;

    iput-object p6, p0, Lyi/h;->f:Lxi/b;

    iput-object p7, p0, Lyi/h;->g:Lxi/b;

    iput-object p8, p0, Lyi/h;->h:Lxi/b;

    iput-object p9, p0, Lyi/h;->i:Lxi/b;

    iput-boolean p10, p0, Lyi/h;->j:Z

    iput-boolean p11, p0, Lyi/h;->k:Z

    return-void
.end method


# virtual methods
.method public final a(Lqi/w;Lqi/i;Lzi/b;)Lsi/c;
    .locals 0

    new-instance p2, Lsi/n;

    invoke-direct {p2, p1, p3, p0}, Lsi/n;-><init>(Lqi/w;Lzi/b;Lyi/h;)V

    return-object p2
.end method
