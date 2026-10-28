.class public final synthetic Ln03/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:J

.field public final synthetic G:Ljava/lang/String;

.field public final synthetic w:Ln6/o;

.field public final synthetic x:Lo6/a;

.field public final synthetic y:I

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Ln6/o;Lo6/a;IFLjava/lang/String;JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln03/b;->w:Ln6/o;

    iput-object p2, p0, Ln03/b;->x:Lo6/a;

    iput p3, p0, Ln03/b;->y:I

    iput p4, p0, Ln03/b;->z:F

    iput-object p5, p0, Ln03/b;->E:Ljava/lang/String;

    iput-wide p6, p0, Ln03/b;->F:J

    iput-object p8, p0, Ln03/b;->G:Ljava/lang/String;

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

    iget-object v0, p0, Ln03/b;->w:Ln6/o;

    iget-object v1, p0, Ln03/b;->x:Lo6/a;

    iget v2, p0, Ln03/b;->y:I

    iget v3, p0, Ln03/b;->z:F

    iget-object v4, p0, Ln03/b;->E:Ljava/lang/String;

    iget-wide v5, p0, Ln03/b;->F:J

    iget-object v7, p0, Ln03/b;->G:Ljava/lang/String;

    invoke-static/range {v0 .. v9}, Ln03/e;->c(Ln6/o;Lo6/a;IFLjava/lang/String;JLjava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
