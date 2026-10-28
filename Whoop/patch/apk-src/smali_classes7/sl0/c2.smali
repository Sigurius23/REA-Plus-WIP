.class public final synthetic Lsl0/c2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Ljava/util/ArrayList;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Lc93/n;

.field public final synthetic J:Lp1/c1;

.field public final synthetic K:Lp1/c1;

.field public final synthetic w:Z

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(ZLc93/a;ZZZZLjava/util/ArrayList;Ljava/util/List;Lc93/n;Lp1/c1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lsl0/c2;->w:Z

    iput-object p2, p0, Lsl0/c2;->x:Lc93/a;

    iput-boolean p3, p0, Lsl0/c2;->y:Z

    iput-boolean p4, p0, Lsl0/c2;->z:Z

    iput-boolean p5, p0, Lsl0/c2;->E:Z

    iput-boolean p6, p0, Lsl0/c2;->F:Z

    iput-object p7, p0, Lsl0/c2;->G:Ljava/util/ArrayList;

    iput-object p8, p0, Lsl0/c2;->H:Ljava/lang/Object;

    iput-object p9, p0, Lsl0/c2;->I:Lc93/n;

    iput-object p10, p0, Lsl0/c2;->J:Lp1/c1;

    iput-object p11, p0, Lsl0/c2;->K:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    iget-object v9, p0, Lsl0/c2;->J:Lp1/c1;

    iget-object v10, p0, Lsl0/c2;->K:Lp1/c1;

    iget-boolean v0, p0, Lsl0/c2;->w:Z

    iget-object v1, p0, Lsl0/c2;->x:Lc93/a;

    iget-boolean v2, p0, Lsl0/c2;->y:Z

    iget-boolean v3, p0, Lsl0/c2;->z:Z

    iget-boolean v4, p0, Lsl0/c2;->E:Z

    iget-boolean v5, p0, Lsl0/c2;->F:Z

    iget-object v6, p0, Lsl0/c2;->G:Ljava/util/ArrayList;

    iget-object v7, p0, Lsl0/c2;->H:Ljava/lang/Object;

    iget-object v8, p0, Lsl0/c2;->I:Lc93/n;

    invoke-static/range {v0 .. v10}, Lsl0/d2;->o(ZLc93/a;ZZZZLjava/util/ArrayList;Ljava/util/List;Lc93/n;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
