.class public final Lyl0/h$b$a$a;
.super Ls83/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyl0/h$b$a;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.bot.view.journalentrywidget.JournalEntryWidgetInteractor$interact$$inlined$transform$1$1"
    f = "JournalEntryWidgetInteractor.kt"
    l = {
        0x29,
        0x2c,
        0x2e,
        0x30,
        0x32,
        0x34,
        0x35,
        0x38,
        0x3a
    }
    m = "emit"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field synthetic w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lyl0/h$b$a;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lyl0/h$b$a;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lyl0/h$b$a$a;->y:Lyl0/h$b$a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lyl0/h$b$a$a;->w:Ljava/lang/Object;

    iget p1, p0, Lyl0/h$b$a$a;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lyl0/h$b$a$a;->x:I

    iget-object p1, p0, Lyl0/h$b$a$a;->y:Lyl0/h$b$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lyl0/h$b$a;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
