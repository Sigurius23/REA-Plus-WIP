.class public final Lxz/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final E:Lv03/h;

.field public final F:Lv03/h;

.field public final G:Lv03/h;

.field public final w:Lv03/h;

.field public final x:Lv03/h;

.field public final y:Lv03/h;

.field public final z:Lv03/h;


# direct methods
.method public constructor <init>(Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/d;Lv03/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxz/y;->w:Lv03/h;

    iput-object p2, p0, Lxz/y;->x:Lv03/h;

    iput-object p3, p0, Lxz/y;->y:Lv03/h;

    iput-object p4, p0, Lxz/y;->z:Lv03/h;

    iput-object p5, p0, Lxz/y;->E:Lv03/h;

    iput-object p6, p0, Lxz/y;->F:Lv03/h;

    iput-object p7, p0, Lxz/y;->G:Lv03/h;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lxz/y;->w:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lxz/f0;

    iget-object v0, p0, Lxz/y;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lwz/g0;

    iget-object v0, p0, Lxz/y;->y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Le00/w;

    iget-object v0, p0, Lxz/y;->z:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lyz/b;

    iget-object v0, p0, Lxz/y;->E:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lb20/f;

    iget-object v0, p0, Lxz/y;->F:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lwz/n0;

    iget-object v0, p0, Lxz/y;->G:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lxz/e0;

    new-instance v1, Lxz/x;

    invoke-direct/range {v1 .. v8}, Lxz/x;-><init>(Lxz/f0;Lwz/g0;Le00/w;Lyz/b;Lb20/f;Lwz/n0;Lxz/e0;)V

    return-object v1
.end method
