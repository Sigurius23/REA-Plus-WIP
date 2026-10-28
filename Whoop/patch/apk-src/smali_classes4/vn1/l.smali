.class public final synthetic Lvn1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:J


# direct methods
.method public synthetic constructor <init>(FJF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lvn1/l;->w:F

    iput p4, p0, Lvn1/l;->x:F

    iput-wide p2, p0, Lvn1/l;->y:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-wide v0, p0, Lvn1/l;->y:J

    check-cast p1, Lk2/e;

    iget v2, p0, Lvn1/l;->w:F

    iget v3, p0, Lvn1/l;->x:F

    invoke-static {v2, v3, v0, v1, p1}, Lvn1/m;->a(FFJLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
