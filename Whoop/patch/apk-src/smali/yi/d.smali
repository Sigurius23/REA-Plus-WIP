.class public final Lyi/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyi/b;


# instance fields
.field public final a:I

.field public final b:Landroid/graphics/Path$FillType;

.field public final c:Lxi/a;

.field public final d:Lxi/a;

.field public final e:Lxi/a;

.field public final f:Lxi/a;

.field public final g:Ljava/lang/String;

.field public final h:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ILandroid/graphics/Path$FillType;Lxi/a;Lxi/a;Lxi/a;Lxi/a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lyi/d;->a:I

    iput-object p3, p0, Lyi/d;->b:Landroid/graphics/Path$FillType;

    iput-object p4, p0, Lyi/d;->c:Lxi/a;

    iput-object p5, p0, Lyi/d;->d:Lxi/a;

    iput-object p6, p0, Lyi/d;->e:Lxi/a;

    iput-object p7, p0, Lyi/d;->f:Lxi/a;

    iput-object p1, p0, Lyi/d;->g:Ljava/lang/String;

    iput-boolean p8, p0, Lyi/d;->h:Z

    return-void
.end method


# virtual methods
.method public final a(Lqi/w;Lqi/i;Lzi/b;)Lsi/c;
    .locals 1

    new-instance v0, Lsi/h;

    invoke-direct {v0, p1, p2, p3, p0}, Lsi/h;-><init>(Lqi/w;Lqi/i;Lzi/b;Lyi/d;)V

    return-object v0
.end method
