.class public final Lgs/g;
.super Lgs/b;
.source "SourceFile"


# instance fields
.field public final b:Lgs/k;

.field public final c:Lro/i;

.field public final d:Lro/i;

.field public final e:Lct/a;

.field public final f:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lgs/k;Lro/i;Lro/i;Lct/a;Ljava/lang/Integer;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lgs/b;-><init>(I)V

    iput-object p1, p0, Lgs/g;->b:Lgs/k;

    iput-object p2, p0, Lgs/g;->c:Lro/i;

    iput-object p3, p0, Lgs/g;->d:Lro/i;

    iput-object p4, p0, Lgs/g;->e:Lct/a;

    iput-object p5, p0, Lgs/g;->f:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final z()Ljava/lang/Integer;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method
