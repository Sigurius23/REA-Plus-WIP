.class public final synthetic Lsy0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lsy0/k$b;

.field public final synthetic x:Z

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Lsy0/k$b;ZLcom/whoop/design/util/TextResource;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsy0/f;->w:Lsy0/k$b;

    iput-boolean p2, p0, Lsy0/f;->x:Z

    iput-object p3, p0, Lsy0/f;->y:Lcom/whoop/design/util/TextResource;

    iput-wide p4, p0, Lsy0/f;->z:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lsy0/f;->w:Lsy0/k$b;

    iget-boolean v1, p0, Lsy0/f;->x:Z

    iget-object v2, p0, Lsy0/f;->y:Lcom/whoop/design/util/TextResource;

    iget-wide v3, p0, Lsy0/f;->z:J

    invoke-static/range {v0 .. v6}, Lsy0/g;->b(Lsy0/k$b;ZLcom/whoop/design/util/TextResource;JLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
