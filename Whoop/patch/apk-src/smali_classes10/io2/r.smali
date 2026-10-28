.class public final synthetic Lio2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ll3/v0;

.field public final synthetic F:J

.field public final synthetic G:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lcom/whoop/navigation/e;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Ll3/v0;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio2/r;->w:Ljava/lang/String;

    iput-object p2, p0, Lio2/r;->x:Ljava/lang/String;

    iput-object p3, p0, Lio2/r;->y:Lcom/whoop/navigation/e;

    iput-object p4, p0, Lio2/r;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lio2/r;->E:Ll3/v0;

    iput-wide p6, p0, Lio2/r;->F:J

    iput p8, p0, Lio2/r;->G:I

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

    iget-object v0, p0, Lio2/r;->w:Ljava/lang/String;

    iget-object v1, p0, Lio2/r;->x:Ljava/lang/String;

    iget-object v2, p0, Lio2/r;->y:Lcom/whoop/navigation/e;

    iget-object v3, p0, Lio2/r;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lio2/r;->E:Ll3/v0;

    iget-wide v5, p0, Lio2/r;->F:J

    iget v7, p0, Lio2/r;->G:I

    invoke-static/range {v0 .. v9}, Lio2/s;->g(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Ll3/v0;JILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
