.class public final synthetic Lny0/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Li2/t;

.field public final synthetic G:Z

.field public final synthetic H:Lc93/a;

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lny0/v;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lny0/t;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lny0/t;->x:Lny0/v;

    iput-object p3, p0, Lny0/t;->y:Ljava/lang/String;

    iput-boolean p4, p0, Lny0/t;->z:Z

    iput-wide p5, p0, Lny0/t;->E:J

    iput-object p7, p0, Lny0/t;->F:Li2/t;

    iput-boolean p8, p0, Lny0/t;->G:Z

    iput-object p9, p0, Lny0/t;->H:Lc93/a;

    iput p10, p0, Lny0/t;->I:I

    iput p11, p0, Lny0/t;->J:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v0, p0, Lny0/t;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lny0/t;->x:Lny0/v;

    iget-object v2, p0, Lny0/t;->y:Ljava/lang/String;

    iget-boolean v3, p0, Lny0/t;->z:Z

    iget-wide v4, p0, Lny0/t;->E:J

    iget-object v6, p0, Lny0/t;->F:Li2/t;

    iget-boolean v7, p0, Lny0/t;->G:Z

    iget-object v8, p0, Lny0/t;->H:Lc93/a;

    iget v9, p0, Lny0/t;->I:I

    iget v10, p0, Lny0/t;->J:I

    invoke-static/range {v0 .. v12}, Lny0/u;->g(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
