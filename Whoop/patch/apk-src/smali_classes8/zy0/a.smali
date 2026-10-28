.class public final synthetic Lzy0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lzy0/e;

.field public final synthetic F:J

.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(FFFJLzy0/e;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lzy0/a;->w:F

    iput p2, p0, Lzy0/a;->x:F

    iput p3, p0, Lzy0/a;->y:F

    iput-wide p4, p0, Lzy0/a;->z:J

    iput-object p6, p0, Lzy0/a;->E:Lzy0/e;

    iput-wide p7, p0, Lzy0/a;->F:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-wide v6, p0, Lzy0/a;->F:J

    move-object v8, p1

    check-cast v8, Lk2/e;

    iget v0, p0, Lzy0/a;->w:F

    iget v1, p0, Lzy0/a;->x:F

    iget v2, p0, Lzy0/a;->y:F

    iget-wide v3, p0, Lzy0/a;->z:J

    iget-object v5, p0, Lzy0/a;->E:Lzy0/e;

    invoke-static/range {v0 .. v8}, Lzy0/b;->b(FFFJLzy0/e;JLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
