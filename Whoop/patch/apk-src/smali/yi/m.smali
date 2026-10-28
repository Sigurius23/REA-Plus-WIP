.class public final Lyi/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyi/b;


# instance fields
.field public final a:Z

.field public final b:Landroid/graphics/Path$FillType;

.field public final c:Ljava/lang/String;

.field public final d:Lxi/a;

.field public final e:Lxi/a;

.field public final f:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLandroid/graphics/Path$FillType;Lxi/a;Lxi/a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyi/m;->c:Ljava/lang/String;

    iput-boolean p2, p0, Lyi/m;->a:Z

    iput-object p3, p0, Lyi/m;->b:Landroid/graphics/Path$FillType;

    iput-object p4, p0, Lyi/m;->d:Lxi/a;

    iput-object p5, p0, Lyi/m;->e:Lxi/a;

    iput-boolean p6, p0, Lyi/m;->f:Z

    return-void
.end method


# virtual methods
.method public final a(Lqi/w;Lqi/i;Lzi/b;)Lsi/c;
    .locals 0

    new-instance p2, Lsi/g;

    invoke-direct {p2, p1, p3, p0}, Lsi/g;-><init>(Lqi/w;Lzi/b;Lyi/m;)V

    return-object p2
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ShapeFill{color=, fillEnabled="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lyi/m;->a:Z

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
