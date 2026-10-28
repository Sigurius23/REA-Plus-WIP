.class public final synthetic Ll1/p2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ly3/m;

.field public final synthetic w:Ll1/e2;

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Ll1/o2;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Ll1/e2;Lc93/a;Ll1/o2;JLy3/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/p2;->w:Ll1/e2;

    iput-object p2, p0, Ll1/p2;->x:Lc93/a;

    iput-object p3, p0, Ll1/p2;->y:Ll1/o2;

    iput-wide p4, p0, Ll1/p2;->z:J

    iput-object p6, p0, Ll1/p2;->E:Ly3/m;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget-wide v3, p0, Ll1/p2;->z:J

    iget-object v5, p0, Ll1/p2;->E:Ly3/m;

    iget-object v0, p0, Ll1/p2;->w:Ll1/e2;

    iget-object v1, p0, Ll1/p2;->x:Lc93/a;

    iget-object v2, p0, Ll1/p2;->y:Ll1/o2;

    invoke-virtual/range {v0 .. v5}, Ll1/e2;->c(Lc93/a;Ll1/o2;JLy3/m;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
