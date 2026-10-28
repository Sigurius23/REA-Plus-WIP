.class final Lia0/a$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lia0/a;->f(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.addactivity.activitieslist.repository.ActivityTypesRepository"
    f = "ActivityTypesRepository.kt"
    l = {
        0x35
    }
    m = "getCachedActivities"
    v = 0x2
.end annotation


# instance fields
.field synthetic w:Ljava/lang/Object;

.field final synthetic x:Lia0/a;

.field y:I


# direct methods
.method public constructor <init>(Lia0/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lia0/a;",
            "Lq83/d<",
            "-",
            "Lia0/a$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lia0/a$f;->x:Lia0/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lia0/a$f;->w:Ljava/lang/Object;

    iget p1, p0, Lia0/a$f;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lia0/a$f;->y:I

    iget-object p1, p0, Lia0/a$f;->x:Lia0/a;

    invoke-virtual {p1, p0}, Lia0/a;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
