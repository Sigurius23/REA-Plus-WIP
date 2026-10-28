.class public final synthetic Lvo1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Landroid/view/Window;

.field public final synthetic x:J

.field public final synthetic y:J


# direct methods
.method public synthetic constructor <init>(Landroid/view/Window;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo1/l;->w:Landroid/view/Window;

    iput-wide p2, p0, Lvo1/l;->x:J

    iput-wide p4, p0, Lvo1/l;->y:J

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget-wide v0, p0, Lvo1/l;->x:J

    iget-wide v2, p0, Lvo1/l;->y:J

    iget-object v4, p0, Lvo1/l;->w:Landroid/view/Window;

    invoke-static {v4, v0, v1, v2, v3}, Lvo1/r;->w(Landroid/view/Window;JJ)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
