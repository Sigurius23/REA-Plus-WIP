.class public final Lqs/h;
.super Lgs/b;
.source "SourceFile"


# instance fields
.field public final b:Lqs/l;

.field public final c:Lro/i;

.field public final d:Lct/a;

.field public final e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lqs/l;Lro/i;Lct/a;Ljava/lang/Integer;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lgs/b;-><init>(I)V

    iput-object p1, p0, Lqs/h;->b:Lqs/l;

    iput-object p2, p0, Lqs/h;->c:Lro/i;

    iput-object p3, p0, Lqs/h;->d:Lct/a;

    iput-object p4, p0, Lqs/h;->e:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final z()Ljava/lang/Integer;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method
