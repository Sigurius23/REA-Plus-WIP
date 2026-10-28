.class public final synthetic Lk80/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lf0/t;

.field public final synthetic F:Lc93/a;

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:Z

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lg1/u0;

.field public final synthetic z:Li2/a1;


# direct methods
.method public synthetic constructor <init>(ZLcom/whoop/design/util/TextResource;Lg1/u0;Li2/a1;Lf0/t;Lc93/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lk80/h;->w:Z

    iput-object p2, p0, Lk80/h;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lk80/h;->y:Lg1/u0;

    iput-object p4, p0, Lk80/h;->z:Li2/a1;

    iput-object p5, p0, Lk80/h;->E:Lf0/t;

    iput-object p6, p0, Lk80/h;->F:Lc93/a;

    iput p7, p0, Lk80/h;->G:I

    iput p8, p0, Lk80/h;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v0, p0, Lk80/h;->w:Z

    iget-object v1, p0, Lk80/h;->x:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lk80/h;->y:Lg1/u0;

    iget-object v3, p0, Lk80/h;->z:Li2/a1;

    iget-object v4, p0, Lk80/h;->E:Lf0/t;

    iget-object v5, p0, Lk80/h;->F:Lc93/a;

    iget v6, p0, Lk80/h;->G:I

    iget v7, p0, Lk80/h;->H:I

    invoke-static/range {v0 .. v9}, Lk80/i;->a(ZLcom/whoop/design/util/TextResource;Lg1/u0;Li2/a1;Lf0/t;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
