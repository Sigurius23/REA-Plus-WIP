.class public final Ll3/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final w:Ll3/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll3/i0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll3/i0;->w:Ll3/i0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ly1/b;

    check-cast p2, Li2/x;

    iget-wide p1, p2, Li2/x;->a:J

    const-wide/16 v0, 0x10

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    invoke-static {p1, p2}, Li2/w0;->H(J)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
