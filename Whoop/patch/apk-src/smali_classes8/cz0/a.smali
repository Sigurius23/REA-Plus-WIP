.class public final synthetic Lcz0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ldz0/c;

.field public final synthetic F:Ljava/util/List;

.field public final synthetic G:Z

.field public final synthetic H:Lc93/m;

.field public final synthetic I:Lh2/c;

.field public final synthetic w:Lh2/c;

.field public final synthetic x:Ld61/a;

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lh2/c;Ld61/a;ZLjava/lang/Object;Ldz0/c;Ljava/util/List;ZLc93/m;Lh2/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcz0/a;->w:Lh2/c;

    iput-object p2, p0, Lcz0/a;->x:Ld61/a;

    iput-boolean p3, p0, Lcz0/a;->y:Z

    iput-object p4, p0, Lcz0/a;->z:Ljava/lang/Object;

    iput-object p5, p0, Lcz0/a;->E:Ldz0/c;

    iput-object p6, p0, Lcz0/a;->F:Ljava/util/List;

    iput-boolean p7, p0, Lcz0/a;->G:Z

    iput-object p8, p0, Lcz0/a;->H:Lc93/m;

    iput-object p9, p0, Lcz0/a;->I:Lh2/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v0, p0, Lcz0/a;->w:Lh2/c;

    iget-object v1, p0, Lcz0/a;->x:Ld61/a;

    iget-boolean v2, p0, Lcz0/a;->y:Z

    iget-object v3, p0, Lcz0/a;->z:Ljava/lang/Object;

    iget-object v4, p0, Lcz0/a;->E:Ldz0/c;

    iget-object v5, p0, Lcz0/a;->F:Ljava/util/List;

    iget-boolean v6, p0, Lcz0/a;->G:Z

    iget-object v7, p0, Lcz0/a;->H:Lc93/m;

    iget-object v8, p0, Lcz0/a;->I:Lh2/c;

    invoke-static/range {v0 .. v10}, Lcz0/f;->c(Lh2/c;Ld61/a;ZLjava/lang/Object;Ldz0/c;Ljava/util/List;ZLc93/m;Lh2/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
