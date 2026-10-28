.class public final Lqs/a;
.super Lgs/b;
.source "SourceFile"


# instance fields
.field public final b:Lqs/d;

.field public final c:Lro/i;

.field public final d:Lct/a;

.field public final e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lqs/d;Lro/i;Lct/a;Ljava/lang/Integer;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lgs/b;-><init>(I)V

    iput-object p1, p0, Lqs/a;->b:Lqs/d;

    iput-object p2, p0, Lqs/a;->c:Lro/i;

    iput-object p3, p0, Lqs/a;->d:Lct/a;

    iput-object p4, p0, Lqs/a;->e:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final z()Ljava/lang/Integer;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method
