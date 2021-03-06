package chara.races
import chara._ 

class Hobbit(char: Characterg) extends RaceDecorator(char){
	override var str = char.str + 0 
	override var dex = char.dex + 2
	override var cons = char.cons + 0
	override var intl = char.intl + 2
	override var wis = char.wis + 0
	override var cha = char.cha + 0
	override var race = "hobbit"

	override var name = char.name
	override var clas = char.clas
	override var exp = char.exp
	override var mana = char.mana
	override var lvl = char.lvl
	override var hp = char.hp
	override var maxHP = char.maxHP
}