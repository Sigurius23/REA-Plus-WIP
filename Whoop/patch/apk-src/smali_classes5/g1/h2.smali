.class public final synthetic Lg1/h2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:J

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Z


# direct methods
.method public synthetic constructor <init>(JLc93/a;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lg1/h2;->w:J

    iput-object p3, p0, Lg1/h2;->x:Lc93/a;

    iput-boolean p4, p0, Lg1/h2;->y:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v5

    iget-wide v0, p0, Lg1/h2;->w:J

    iget-object v2, p0, Lg1/h2;->x:Lc93/a;

    iget-boolean v3, p0, Lg1/h2;->y:Z

    invoke-static/range {v0 .. v5}, Lg1/p2;->b(JLc93/a;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
