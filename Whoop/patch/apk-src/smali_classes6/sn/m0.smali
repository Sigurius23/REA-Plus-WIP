.class public final Lsn/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/u;


# instance fields
.field public final a:Ld1/j;

.field public final b:Lrm/p;

.field public final c:Lf93/a;

.field public final d:Lg73/d;

.field public final e:I


# direct methods
.method public constructor <init>(Ld1/j;Lwm/g;)V
    .locals 3

    new-instance v0, Lrm/p;

    const/16 v1, 0xb

    invoke-direct {v0, p2, v1}, Lrm/p;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lf93/a;

    const/4 v1, 0x6

    invoke-direct {p2, v1}, Lf93/a;-><init>(I)V

    new-instance v1, Lg73/d;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Lg73/d;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/m0;->a:Ld1/j;

    iput-object v0, p0, Lsn/m0;->b:Lrm/p;

    iput-object p2, p0, Lsn/m0;->c:Lf93/a;

    iput-object v1, p0, Lsn/m0;->d:Lg73/d;

    const/high16 p1, 0x100000

    iput p1, p0, Lsn/m0;->e:I

    return-void
.end method


# virtual methods
.method public final a(Lrm/k0;)Lsn/a;
    .locals 8

    iget-object v0, p1, Lrm/k0;->x:Lrm/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p1, Lrm/k0;->x:Lrm/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lsn/n0;

    iget-object v0, p0, Lsn/m0;->c:Lf93/a;

    invoke-virtual {v0, p1}, Lf93/a;->d(Lrm/k0;)Lvm/h;

    move-result-object v5

    iget-object v6, p0, Lsn/m0;->d:Lg73/d;

    iget v7, p0, Lsn/m0;->e:I

    iget-object v3, p0, Lsn/m0;->a:Ld1/j;

    iget-object v4, p0, Lsn/m0;->b:Lrm/p;

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lsn/n0;-><init>(Lrm/k0;Ld1/j;Lrm/p;Lvm/h;Lg73/d;I)V

    return-object v1
.end method
